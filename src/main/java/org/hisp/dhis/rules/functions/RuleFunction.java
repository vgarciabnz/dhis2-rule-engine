package org.hisp.dhis.rules.functions;

import org.hisp.dhis.rules.RuleVariableValue;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public abstract class RuleFunction
{
        static final String DATE_PATTERN = "yyyy-MM-dd";

        @Nonnull
        public abstract String evaluate( @Nonnull List<String> arguments,
            Map<String, RuleVariableValue> valueMap, Map<String, List<String>> supplementaryData );

        @Nullable
        public static RuleFunction create( @Nonnull String fun )
        {
                switch ( fun )
                {
                case RuleFunctionDaysBetween.D2_DAYS_BETWEEN:
                        return RuleFunctionDaysBetween.create();
                case RuleFunctionWeeksBetween.D2_WEEKS_BETWEEN:
                        return RuleFunctionWeeksBetween.create();
                case RuleFunctionHasValue.D2_HAS_VALUE:
                        return RuleFunctionHasValue.create();
                case RuleFunctionFloor.D2_FLOOR:
                        return RuleFunctionFloor.create();
                case RuleFunctionCeil.D2_CEIL:
                        return RuleFunctionCeil.create();
                case RuleFunctionAddDays.D2_ADD_DAYS:
                        return RuleFunctionAddDays.create();
                case RuleFunctionCountIfValue.D2_COUNT_IF_VALUE:
                        return RuleFunctionCountIfValue.create();
                case RuleFunctionInOrgUnitGroup.D2_IN_ORG_UNIT_GROUP:
                        return RuleFunctionInOrgUnitGroup.create();
                default:
                        return null;
                }
        }

        @Nonnull
        public String wrap( String input )
        {
                if( input == null )
                {
                        return "";
                }

                return "'"+input+"'";
        }
}
