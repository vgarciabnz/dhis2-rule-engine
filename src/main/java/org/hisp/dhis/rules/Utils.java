package org.hisp.dhis.rules;

import org.hisp.dhis.rules.models.RuleDataValue;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class Utils
{
        private Utils()
        {
                // no instances
        }

        @Nonnull
        static List<String> values( @Nonnull List<RuleDataValue> ruleDataValues )
        {
                List<String> values = new ArrayList<>( ruleDataValues.size() );
                for ( RuleDataValue ruleDataValue : ruleDataValues )
                {
                        values.add( ruleDataValue.value() );
                }
                return Collections.unmodifiableList( values );
        }
}
