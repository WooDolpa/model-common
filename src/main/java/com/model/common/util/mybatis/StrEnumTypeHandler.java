package com.model.common.util.mybatis;

import com.model.common.enums.DataStatus;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * packageName : com.model.common.model
 * className : AdminModel
 * user : jwlee
 * date : 2022/10/02
 */
@MappedTypes({
        DataStatus.class
})
@Slf4j
public class StrEnumTypeHandler<E extends Enum<E>> extends BaseTypeHandler<E> {

    private Class<E> type;

    public StrEnumTypeHandler(Class<E> type) {
        if(type == null){
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, final int i, final E parameter, JdbcType jdbcType) throws SQLException {
        try
        {
            Method method = type.getMethod("toStr");

            if (jdbcType == null)
            {
                ps.setString(i, (String) method.invoke(parameter));
            }
            else
            {
                ps.setObject(i, (String) method.invoke(parameter), jdbcType.TYPE_CODE);
            }
        }
        catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
        {
            throw new SQLException(e);
        }
    }

    @Override
    public E getNullableResult(final ResultSet rs, final String columnName) throws SQLException
    {
        return getEnum(rs.getString(columnName));
    }

    @Override
    public E getNullableResult(final ResultSet rs, final int columnIndex) throws SQLException
    {
        return getEnum(rs.getString(columnIndex));
    }

    @Override
    public E getNullableResult(final CallableStatement cs, final int columnIndex) throws SQLException
    {
        return getEnum(cs.getString(columnIndex));
    }

    @SuppressWarnings("unchecked")
    private E getEnum(final String stringValue) throws SQLException
    {
        try
        {
            return (E) type.getMethod("get", String.class).invoke(null, stringValue);
        }
        catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
        {
            throw new SQLException(e);
        }
    }
}
