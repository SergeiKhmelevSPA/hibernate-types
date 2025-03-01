package io.hypersistence.utils.hibernate.type.money;

import io.hypersistence.utils.hibernate.type.MutableType;
import io.hypersistence.utils.hibernate.type.money.internal.CurrencyUnitTypeDescriptor;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import javax.money.CurrencyUnit;

/**
 * Maps a Java {@link CurrencyUnit} object to a {@code VARCHAR} column type.
 *
 * @author Piotr Olaszewski
 */
public class CurrencyUnitType extends MutableType<CurrencyUnit, VarcharJdbcType, CurrencyUnitTypeDescriptor> {
    public CurrencyUnitType() {
        super(CurrencyUnit.class, VarcharJdbcType.INSTANCE, CurrencyUnitTypeDescriptor.INSTANCE);
    }
}
