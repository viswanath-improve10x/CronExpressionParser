package com.viswanath.cronexpparser.fields;

public class MinutesParser extends FieldParser {

    public MinutesParser(String fieldExpression) {
        super(fieldExpression);
    }

    @Override
    protected FieldType getFieldType() {
        return FieldType.MINUTES;
    }
}

