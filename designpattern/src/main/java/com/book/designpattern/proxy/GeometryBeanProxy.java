package com.book.designpattern.proxy;

public class GeometryBeanProxy implements GeometryCalculatorBean{
    private GeometryCalculatorBean bean;

    public GeometryBeanProxy() throws Exception{
        bean = doJDNILookup("remote://localhost:4447", "user", "password");
    }

    private GeometryCalculatorBean doJDNILookup(final String urlProvider, final String securityPrincipal, final String securityCredentials) throws Exception{
        System.out.println("DO JNDI lookup for bean");
        Thread.sleep(123);
        return GeometryCalculatorBeanFactory.LOCAL.makeGeometryCalculator();

    }

    @Override
    public double calculateCircleCircumference(Circle circle) {
        return bean.calculateCircleCircumference(circle);
    }
}
