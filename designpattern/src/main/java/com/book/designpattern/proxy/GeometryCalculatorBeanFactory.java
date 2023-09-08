package com.book.designpattern.proxy;

public enum GeometryCalculatorBeanFactory {
    LOCAL {
        public GeometryCalculatorBean makeGeometryCalculator() {
            return new GeometryBean();
        }
    },
    REMOTE_PROXY {
        public GeometryCalculatorBean makeGeometryCalculator() {
            try {
                return new GeometryBeanProxy();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    };

    public abstract GeometryCalculatorBean makeGeometryCalculator();
}
