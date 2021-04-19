/**
 * FrontGateSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package com.ibm.websphere.samples.order.ejb;

public class FrontGateSoapBindingStub extends com.ibm.ws.webservices.engine.client.Stub implements com.ibm.websphere.samples.order.ejb.FrontGate_SEI {
    public FrontGateSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws com.ibm.ws.webservices.engine.WebServicesFault {
        if (service == null) {
            super.service = new com.ibm.ws.webservices.engine.client.Service();
        }
        else {
            super.service = service;
        }
        super.engine = ((com.ibm.ws.webservices.engine.client.Service) super.service).getEngine();
        super.messageContexts = new com.ibm.ws.webservices.engine.MessageContext[4];
        java.lang.String theOption = (java.lang.String)super._getProperty("lastStubMapping");
        if (theOption == null || !theOption.equals("com.ibm.websphere.samples.order.ejb.FrontGateSoapBinding")) {
                initTypeMapping();
                super._setProperty("lastStubMapping","com.ibm.websphere.samples.order.ejb.FrontGateSoapBinding");
        }
        super.cachedEndpoint = endpointURL;
        super.connection = ((com.ibm.ws.webservices.engine.client.Service) super.service).getConnection(endpointURL);
    }

    private void initTypeMapping() {
        javax.xml.rpc.encoding.TypeMapping tm = super.getTypeMapping(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
        java.lang.Class javaType = null;
        javax.xml.namespace.QName xmlType = null;
        javax.xml.namespace.QName compQName = null;
        javax.xml.namespace.QName compTypeQName = null;
        com.ibm.ws.webservices.engine.encoding.SerializerFactory sf = null;
        com.ibm.ws.webservices.engine.encoding.DeserializerFactory df = null;
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _updateOrderStatusOperation0 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getupdateOrderStatusOperation0() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "orderID"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "orderStatus"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[0].setOption("partName","string");
        _params0[1].setOption("inputPosition","1");
        _params0[1].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[1].setOption("partName","string");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(null, com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://websphere.ibm.com/webservices/", "Void"), void.class, true, false, false, false, true, true); 
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _updateOrderStatusOperation0 = new com.ibm.ws.webservices.engine.description.OperationDesc("updateOrderStatus", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateOrderStatus"), _params0, _returnDesc0, _faults0, "");
        _updateOrderStatusOperation0.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEI"));
        _updateOrderStatusOperation0.setOption("inputName","updateOrderStatusRequest");
        _updateOrderStatusOperation0.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateOrderStatusResponse"));
        _updateOrderStatusOperation0.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEIService"));
        _updateOrderStatusOperation0.setOption("buildNum","cf070942.33");
        _updateOrderStatusOperation0.setOption("ResponseNamespace","http://ejb.order.samples.websphere.ibm.com");
        _updateOrderStatusOperation0.setOption("targetNamespace","http://ejb.order.samples.websphere.ibm.com");
        _updateOrderStatusOperation0.setOption("outputName","updateOrderStatusResponse");
        _updateOrderStatusOperation0.setOption("ResponseLocalPart","updateOrderStatusResponse");
        _updateOrderStatusOperation0.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateOrderStatusRequest"));
        _updateOrderStatusOperation0.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _updateOrderStatusOperation0.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _updateOrderStatusOperation0;

    }

    private int _updateOrderStatusIndex0 = 0;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getupdateOrderStatusInvoke0(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_updateOrderStatusIndex0];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(FrontGateSoapBindingStub._updateOrderStatusOperation0);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_updateOrderStatusIndex0] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public void updateOrderStatus(java.lang.String orderID, java.lang.String orderStatus) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        try {
            _getupdateOrderStatusInvoke0(new java.lang.Object[] {orderID, orderStatus}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _sendOrderOperation1 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getsendOrderOperation1() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params1 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "uid"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "orderID"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "item"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "quantity"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false, false, false, true, false), 
          };
        _params1[0].setOption("inputPosition","0");
        _params1[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params1[0].setOption("partName","string");
        _params1[1].setOption("inputPosition","1");
        _params1[1].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params1[1].setOption("partName","string");
        _params1[2].setOption("inputPosition","2");
        _params1[2].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params1[2].setOption("partName","string");
        _params1[3].setOption("inputPosition","3");
        _params1[3].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}int");
        _params1[3].setOption("partName","int");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc1 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "sendOrderReturn"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false, false, false, true, false); 
        _returnDesc1.setOption("outputPosition","0");
        _returnDesc1.setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _returnDesc1.setOption("partName","string");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults1 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _sendOrderOperation1 = new com.ibm.ws.webservices.engine.description.OperationDesc("sendOrder", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "sendOrder"), _params1, _returnDesc1, _faults1, "");
        _sendOrderOperation1.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEI"));
        _sendOrderOperation1.setOption("inputName","sendOrderRequest");
        _sendOrderOperation1.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "sendOrderResponse"));
        _sendOrderOperation1.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEIService"));
        _sendOrderOperation1.setOption("buildNum","cf070942.33");
        _sendOrderOperation1.setOption("ResponseNamespace","http://ejb.order.samples.websphere.ibm.com");
        _sendOrderOperation1.setOption("targetNamespace","http://ejb.order.samples.websphere.ibm.com");
        _sendOrderOperation1.setOption("outputName","sendOrderResponse");
        _sendOrderOperation1.setOption("ResponseLocalPart","sendOrderResponse");
        _sendOrderOperation1.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "sendOrderRequest"));
        _sendOrderOperation1.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _sendOrderOperation1.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _sendOrderOperation1;

    }

    private int _sendOrderIndex1 = 1;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getsendOrderInvoke1(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_sendOrderIndex1];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(FrontGateSoapBindingStub._sendOrderOperation1);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_sendOrderIndex1] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public java.lang.String sendOrder(java.lang.String uid, java.lang.String orderID, java.lang.String item, int quantity) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getsendOrderInvoke1(new java.lang.Object[] {uid, orderID, item, new java.lang.Integer(quantity)}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        try {
            return (java.lang.String) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (java.lang.String) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), java.lang.String.class);
        }
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _updateItemStatusOperation2 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getupdateItemStatusOperation2() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params2 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "orderID"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "item"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "status"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
          };
        _params2[0].setOption("inputPosition","0");
        _params2[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params2[0].setOption("partName","string");
        _params2[1].setOption("inputPosition","1");
        _params2[1].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params2[1].setOption("partName","string");
        _params2[2].setOption("inputPosition","2");
        _params2[2].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params2[2].setOption("partName","string");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc2 = new com.ibm.ws.webservices.engine.description.ParameterDesc(null, com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://websphere.ibm.com/webservices/", "Void"), void.class, true, false, false, false, true, true); 
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults2 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _updateItemStatusOperation2 = new com.ibm.ws.webservices.engine.description.OperationDesc("updateItemStatus", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateItemStatus"), _params2, _returnDesc2, _faults2, "");
        _updateItemStatusOperation2.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEI"));
        _updateItemStatusOperation2.setOption("inputName","updateItemStatusRequest");
        _updateItemStatusOperation2.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateItemStatusResponse"));
        _updateItemStatusOperation2.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEIService"));
        _updateItemStatusOperation2.setOption("buildNum","cf070942.33");
        _updateItemStatusOperation2.setOption("ResponseNamespace","http://ejb.order.samples.websphere.ibm.com");
        _updateItemStatusOperation2.setOption("targetNamespace","http://ejb.order.samples.websphere.ibm.com");
        _updateItemStatusOperation2.setOption("outputName","updateItemStatusResponse");
        _updateItemStatusOperation2.setOption("ResponseLocalPart","updateItemStatusResponse");
        _updateItemStatusOperation2.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateItemStatusRequest"));
        _updateItemStatusOperation2.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _updateItemStatusOperation2.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _updateItemStatusOperation2;

    }

    private int _updateItemStatusIndex2 = 2;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getupdateItemStatusInvoke2(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_updateItemStatusIndex2];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(FrontGateSoapBindingStub._updateItemStatusOperation2);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_updateItemStatusIndex2] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public void updateItemStatus(java.lang.String orderID, java.lang.String item, java.lang.String status) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        try {
            _getupdateItemStatusInvoke2(new java.lang.Object[] {orderID, item, status}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _checkOrderStatusOperation3 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getcheckOrderStatusOperation3() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params3 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "orderID"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
          };
        _params3[0].setOption("inputPosition","0");
        _params3[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params3[0].setOption("partName","string");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc3 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "checkOrderStatusReturn"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, true, false, false, false, true, false); 
        _returnDesc3.setOption("outputPosition","0");
        _returnDesc3.setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}boolean");
        _returnDesc3.setOption("partName","boolean");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults3 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _checkOrderStatusOperation3 = new com.ibm.ws.webservices.engine.description.OperationDesc("checkOrderStatus", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "checkOrderStatus"), _params3, _returnDesc3, _faults3, "");
        _checkOrderStatusOperation3.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEI"));
        _checkOrderStatusOperation3.setOption("inputName","checkOrderStatusRequest");
        _checkOrderStatusOperation3.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "checkOrderStatusResponse"));
        _checkOrderStatusOperation3.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEIService"));
        _checkOrderStatusOperation3.setOption("buildNum","cf070942.33");
        _checkOrderStatusOperation3.setOption("ResponseNamespace","http://ejb.order.samples.websphere.ibm.com");
        _checkOrderStatusOperation3.setOption("targetNamespace","http://ejb.order.samples.websphere.ibm.com");
        _checkOrderStatusOperation3.setOption("outputName","checkOrderStatusResponse");
        _checkOrderStatusOperation3.setOption("ResponseLocalPart","checkOrderStatusResponse");
        _checkOrderStatusOperation3.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "checkOrderStatusRequest"));
        _checkOrderStatusOperation3.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _checkOrderStatusOperation3.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _checkOrderStatusOperation3;

    }

    private int _checkOrderStatusIndex3 = 3;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getcheckOrderStatusInvoke3(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_checkOrderStatusIndex3];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(FrontGateSoapBindingStub._checkOrderStatusOperation3);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_checkOrderStatusIndex3] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public boolean checkOrderStatus(java.lang.String orderID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getcheckOrderStatusInvoke3(new java.lang.Object[] {orderID}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        try {
            return ((java.lang.Boolean) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue()).booleanValue();
        } catch (java.lang.Exception _exception) {
            return ((java.lang.Boolean) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), boolean.class)).booleanValue();
        }
    }

    private static void _staticInit() {
        _sendOrderOperation1 = _getsendOrderOperation1();
        _updateOrderStatusOperation0 = _getupdateOrderStatusOperation0();
        _checkOrderStatusOperation3 = _getcheckOrderStatusOperation3();
        _updateItemStatusOperation2 = _getupdateItemStatusOperation2();
    }

    static {
       _staticInit();
    }
}
