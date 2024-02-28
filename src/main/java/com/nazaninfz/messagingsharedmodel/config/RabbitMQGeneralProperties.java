package com.nazaninfz.messagingsharedmodel.config;

public class RabbitMQGeneralProperties {


    public final static String EXECUTION_TOPIC_EXCHANGE = "execution-topic-exchange";
    public final static String ROLLBACK_REQUEST_FANOUT_EXCHANGE = "rollback-request-fanout-exchange";
    public final static String ROLLBACK_RESPONSE_FANOUT_EXCHANGE = "rollback-response-fanout-exchange";
    public final static String COMPLETE_SEQUENCE_FANOUT_EXCHANGE = "complete-sequence-fanout-exchange";

    public static String createExecutionQueue(String msName){
        return "MS-"+msName+"-execution-queue";
    }

    public static String createExecutionRoutingKey(String msName){
        return "MS-"+msName+"-execution-routing-key";
    }

    public static String createRollbackRequestQueue(String msName){
        return "MS-"+msName+"-rollback-request-queue";
    }

    public static String createRollbackRequestRoutingKey(String msName){
        return "MS-"+msName+"-rollback-request-routing-key";
    }

    public static String createCompleteSequenceQueue(String msName){
        return "MS-"+msName+"-complete-sequence-queue";
    }

    public static String createCompleteSequenceRoutingKey(String msName){
        return "MS-"+msName+"-complete-sequence-routing-key";
    }

    public static String createRollbackResponseQueue(String orcName){
        return "ORC-"+orcName+"-rollback-response-queue";
    }

    public static String createRollbackResponseRoutingKey(String orcName){
        return "ORC-"+orcName+"-rollback-response-routing-key";
    }

}
