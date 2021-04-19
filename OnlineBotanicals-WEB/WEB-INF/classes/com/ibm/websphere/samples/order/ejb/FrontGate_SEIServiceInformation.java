/**
 * FrontGate_SEIServiceInformation.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package com.ibm.websphere.samples.order.ejb;

public class FrontGate_SEIServiceInformation implements com.ibm.ws.webservices.multiprotocol.ServiceInformation {

    private static java.util.Map operationDescriptions;
    private static java.util.Map typeMappings;

    static {
         initOperationDescriptions();
         initTypeMappings();
    }

    private static void initOperationDescriptions() { 
        operationDescriptions = new java.util.HashMap();

        java.util.Map inner0 = new java.util.HashMap();

        java.util.List list0 = new java.util.ArrayList();
        inner0.put("checkOrderStatus", list0);

        com.ibm.ws.webservices.engine.description.OperationDesc checkOrderStatus0Op = _checkOrderStatus0Op();
        list0.add(checkOrderStatus0Op);

        java.util.List list1 = new java.util.ArrayList();
        inner0.put("sendOrder", list1);

        com.ibm.ws.webservices.engine.description.OperationDesc sendOrder1Op = _sendOrder1Op();
        list1.add(sendOrder1Op);

        java.util.List list2 = new java.util.ArrayList();
        inner0.put("updateItemStatus", list2);

        com.ibm.ws.webservices.engine.description.OperationDesc updateItemStatus2Op = _updateItemStatus2Op();
        list2.add(updateItemStatus2Op);

        java.util.List list3 = new java.util.ArrayList();
        inner0.put("updateOrderStatus", list3);

        com.ibm.ws.webservices.engine.description.OperationDesc updateOrderStatus3Op = _updateOrderStatus3Op();
        list3.add(updateOrderStatus3Op);

        operationDescriptions.put("FrontGate",inner0);
        operationDescriptions = java.util.Collections.unmodifiableMap(operationDescriptions);
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _checkOrderStatus0Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc checkOrderStatus0Op = null;
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "orderID"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[0].setOption("partName","string");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "checkOrderStatusReturn"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, true, false, false, false, true, false); 
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}boolean");
        _returnDesc0.setOption("partName","boolean");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        checkOrderStatus0Op = new com.ibm.ws.webservices.engine.description.OperationDesc("checkOrderStatus", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "checkOrderStatus"), _params0, _returnDesc0, _faults0, null);
        checkOrderStatus0Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEI"));
        checkOrderStatus0Op.setOption("inputName","checkOrderStatusRequest");
        checkOrderStatus0Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "checkOrderStatusResponse"));
        checkOrderStatus0Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEIService"));
        checkOrderStatus0Op.setOption("buildNum","cf070942.33");
        checkOrderStatus0Op.setOption("ResponseNamespace","http://ejb.order.samples.websphere.ibm.com");
        checkOrderStatus0Op.setOption("targetNamespace","http://ejb.order.samples.websphere.ibm.com");
        checkOrderStatus0Op.setOption("outputName","checkOrderStatusResponse");
        checkOrderStatus0Op.setOption("ResponseLocalPart","checkOrderStatusResponse");
        checkOrderStatus0Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "checkOrderStatusRequest"));
        checkOrderStatus0Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return checkOrderStatus0Op;

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _sendOrder1Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc sendOrder1Op = null;
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "uid"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "orderID"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "item"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "quantity"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[0].setOption("partName","string");
        _params0[1].setOption("inputPosition","1");
        _params0[1].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[1].setOption("partName","string");
        _params0[2].setOption("inputPosition","2");
        _params0[2].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[2].setOption("partName","string");
        _params0[3].setOption("inputPosition","3");
        _params0[3].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}int");
        _params0[3].setOption("partName","int");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "sendOrderReturn"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false, false, false, true, false); 
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _returnDesc0.setOption("partName","string");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        sendOrder1Op = new com.ibm.ws.webservices.engine.description.OperationDesc("sendOrder", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "sendOrder"), _params0, _returnDesc0, _faults0, null);
        sendOrder1Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEI"));
        sendOrder1Op.setOption("inputName","sendOrderRequest");
        sendOrder1Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "sendOrderResponse"));
        sendOrder1Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEIService"));
        sendOrder1Op.setOption("buildNum","cf070942.33");
        sendOrder1Op.setOption("ResponseNamespace","http://ejb.order.samples.websphere.ibm.com");
        sendOrder1Op.setOption("targetNamespace","http://ejb.order.samples.websphere.ibm.com");
        sendOrder1Op.setOption("outputName","sendOrderResponse");
        sendOrder1Op.setOption("ResponseLocalPart","sendOrderResponse");
        sendOrder1Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "sendOrderRequest"));
        sendOrder1Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return sendOrder1Op;

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _updateItemStatus2Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc updateItemStatus2Op = null;
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "orderID"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "item"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "status"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[0].setOption("partName","string");
        _params0[1].setOption("inputPosition","1");
        _params0[1].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[1].setOption("partName","string");
        _params0[2].setOption("inputPosition","2");
        _params0[2].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[2].setOption("partName","string");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(null, com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://websphere.ibm.com/webservices/", "Void"), void.class, true, false, false, false, true, true); 
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        updateItemStatus2Op = new com.ibm.ws.webservices.engine.description.OperationDesc("updateItemStatus", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateItemStatus"), _params0, _returnDesc0, _faults0, null);
        updateItemStatus2Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEI"));
        updateItemStatus2Op.setOption("inputName","updateItemStatusRequest");
        updateItemStatus2Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateItemStatusResponse"));
        updateItemStatus2Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEIService"));
        updateItemStatus2Op.setOption("buildNum","cf070942.33");
        updateItemStatus2Op.setOption("ResponseNamespace","http://ejb.order.samples.websphere.ibm.com");
        updateItemStatus2Op.setOption("targetNamespace","http://ejb.order.samples.websphere.ibm.com");
        updateItemStatus2Op.setOption("outputName","updateItemStatusResponse");
        updateItemStatus2Op.setOption("ResponseLocalPart","updateItemStatusResponse");
        updateItemStatus2Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateItemStatusRequest"));
        updateItemStatus2Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return updateItemStatus2Op;

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _updateOrderStatus3Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc updateOrderStatus3Op = null;
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
        updateOrderStatus3Op = new com.ibm.ws.webservices.engine.description.OperationDesc("updateOrderStatus", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateOrderStatus"), _params0, _returnDesc0, _faults0, null);
        updateOrderStatus3Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEI"));
        updateOrderStatus3Op.setOption("inputName","updateOrderStatusRequest");
        updateOrderStatus3Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateOrderStatusResponse"));
        updateOrderStatus3Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "FrontGate_SEIService"));
        updateOrderStatus3Op.setOption("buildNum","cf070942.33");
        updateOrderStatus3Op.setOption("ResponseNamespace","http://ejb.order.samples.websphere.ibm.com");
        updateOrderStatus3Op.setOption("targetNamespace","http://ejb.order.samples.websphere.ibm.com");
        updateOrderStatus3Op.setOption("outputName","updateOrderStatusResponse");
        updateOrderStatus3Op.setOption("ResponseLocalPart","updateOrderStatusResponse");
        updateOrderStatus3Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://ejb.order.samples.websphere.ibm.com", "updateOrderStatusRequest"));
        updateOrderStatus3Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return updateOrderStatus3Op;

    }


    private static void initTypeMappings() {
        typeMappings = new java.util.HashMap();
        typeMappings = java.util.Collections.unmodifiableMap(typeMappings);
    }

    public java.util.Map getTypeMappings() {
        return typeMappings;
    }

    public Class getJavaType(javax.xml.namespace.QName xmlName) {
        return (Class) typeMappings.get(xmlName);
    }

    public java.util.Map getOperationDescriptions(String portName) {
        return (java.util.Map) operationDescriptions.get(portName);
    }

    public java.util.List getOperationDescriptions(String portName, String operationName) {
        java.util.Map map = (java.util.Map) operationDescriptions.get(portName);
        if (map != null) {
            return (java.util.List) map.get(operationName);
        }
        return null;
    }

}
