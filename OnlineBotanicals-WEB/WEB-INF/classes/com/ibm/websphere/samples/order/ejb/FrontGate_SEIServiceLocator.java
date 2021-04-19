/**
 * FrontGate_SEIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package com.ibm.websphere.samples.order.ejb;

public class FrontGate_SEIServiceLocator extends com.ibm.ws.webservices.multiprotocol.AgnosticService implements com.ibm.ws.webservices.multiprotocol.GeneratedService, com.ibm.websphere.samples.order.ejb.FrontGate_SEIService {

    public FrontGate_SEIServiceLocator() {
        super(com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
           "http://ejb.order.samples.websphere.ibm.com",
           "FrontGate_SEIService"));

        context.setLocatorName("com.ibm.websphere.samples.order.ejb.FrontGate_SEIServiceLocator");
    }

    public FrontGate_SEIServiceLocator(com.ibm.ws.webservices.multiprotocol.ServiceContext ctx) {
        super(ctx);
        context.setLocatorName("com.ibm.websphere.samples.order.ejb.FrontGate_SEIServiceLocator");
    }

    // Use to get a proxy class for frontGate
    private final java.lang.String frontGate_address = "http://localhost:9080/OrderProcessorEJB/services/FrontGate";

    public java.lang.String getFrontGateAddress() {
        if (context.getOverriddingEndpointURIs() == null) {
            return frontGate_address;
        }
        String overriddingEndpoint = (String) context.getOverriddingEndpointURIs().get("FrontGate");
        if (overriddingEndpoint != null) {
            return overriddingEndpoint;
        }
        else {
            return frontGate_address;
        }
    }

    private java.lang.String frontGatePortName = "FrontGate";

    // The WSDD port name defaults to the port name.
    private java.lang.String frontGateWSDDPortName = "FrontGate";

    public java.lang.String getFrontGateWSDDPortName() {
        return frontGateWSDDPortName;
    }

    public void setFrontGateWSDDPortName(java.lang.String name) {
        frontGateWSDDPortName = name;
    }

    public com.ibm.websphere.samples.order.ejb.FrontGate_SEI getFrontGate() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getFrontGateAddress());
        }
        catch (java.net.MalformedURLException e) {
            return null; // unlikely as URL was validated in WSDL2Java
        }
        return getFrontGate(endpoint);
    }

    public com.ibm.websphere.samples.order.ejb.FrontGate_SEI getFrontGate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        com.ibm.websphere.samples.order.ejb.FrontGate_SEI _stub =
            (com.ibm.websphere.samples.order.ejb.FrontGate_SEI) getStub(
                frontGatePortName,
                (String) getPort2NamespaceMap().get(frontGatePortName),
                com.ibm.websphere.samples.order.ejb.FrontGate_SEI.class,
                "com.ibm.websphere.samples.order.ejb.FrontGateSoapBindingStub",
                portAddress.toString());
        if (_stub instanceof com.ibm.ws.webservices.engine.client.Stub) {
            ((com.ibm.ws.webservices.engine.client.Stub) _stub).setPortName(frontGateWSDDPortName);
        }
        return _stub;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.websphere.samples.order.ejb.FrontGate_SEI.class.isAssignableFrom(serviceEndpointInterface)) {
                return getFrontGate();
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("WSWS3273E: Error: There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        String inputPortName = portName.getLocalPart();
        if ("FrontGate".equals(inputPortName)) {
            return getFrontGate();
        }
        else  {
            throw new javax.xml.rpc.ServiceException();
        }
    }

    public void setPortNamePrefix(java.lang.String prefix) {
        frontGateWSDDPortName = prefix + "/" + frontGatePortName;
    }

    public javax.xml.namespace.QName getServiceName() {
        return com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEIService");
    }

    private java.util.Map port2NamespaceMap = null;

    protected synchronized java.util.Map getPort2NamespaceMap() {
        if (port2NamespaceMap == null) {
            port2NamespaceMap = new java.util.HashMap();
            port2NamespaceMap.put(
               "FrontGate",
               "http://schemas.xmlsoap.org/wsdl/soap/");
        }
        return port2NamespaceMap;
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            String serviceNamespace = getServiceName().getNamespaceURI();
            for (java.util.Iterator i = getPort2NamespaceMap().keySet().iterator(); i.hasNext(); ) {
                ports.add(
                    com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                        serviceNamespace,
                        (String) i.next()));
            }
        }
        return ports.iterator();
    }

    public javax.xml.rpc.Call[] getCalls(javax.xml.namespace.QName portName) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName should not be null.");
        }
        if  (portName.getLocalPart().equals("FrontGate")) {
            return new javax.xml.rpc.Call[] {
                createCall(portName, "updateOrderStatus", "updateOrderStatusRequest"),
                createCall(portName, "sendOrder", "sendOrderRequest"),
                createCall(portName, "updateItemStatus", "updateItemStatusRequest"),
                createCall(portName, "checkOrderStatus", "checkOrderStatusRequest"),
            };
        }
        else {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName should not be null.");
        }
    }
}
