// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer-service.proto

package com.fuchuan.customerservice.common;

public final class CustomerServiceGrpc {
  private CustomerServiceGrpc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fuchuan_customerservice_common_AccountBaseInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fuchuan_customerservice_common_AccountBaseInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fuchuan_customerservice_common_FetchAccountListBaseInfoReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fuchuan_customerservice_common_FetchAccountListBaseInfoReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fuchuan_customerservice_common_FetchAccountListBaseInfoReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fuchuan_customerservice_common_FetchAccountListBaseInfoReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fuchuan_customerservice_common_Waiters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fuchuan_customerservice_common_Waiters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fuchuan_customerservice_common_WaitersReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fuchuan_customerservice_common_WaitersReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026customer-service.proto\022\"com.fuchuan.cu" +
      "stomerservice.common\"?\n\017AccountBaseInfo\022" +
      "\n\n\002id\030\002 \001(\t\022\020\n\010nickName\030\003 \001(\t\022\016\n\006avatar\030" +
      "\004 \001(\t\" \n\022AccountBaseInfoReq\022\n\n\002id\030\001 \001(\t\"" +
      "\314\001\n\024AccountBaseInfoReply\0226\n\004code\030\001 \001(\0162(" +
      ".com.fuchuan.customerservice.common.Code" +
      "\022D\n\007account\030\002 \001(\01323.com.fuchuan.customer" +
      "service.common.AccountBaseInfo\0226\n\004role\030\003" +
      " \001(\0162(.com.fuchuan.customerservice.commo" +
      "n.Role\")\n\033FetchAccountListBaseInfoReq\022\n\n" +
      "\002id\030\001 \003(\t\"e\n\035FetchAccountListBaseInfoRep" +
      "ly\022D\n\007account\030\001 \003(\01323.com.fuchuan.custom" +
      "erservice.common.AccountBaseInfo\"O\n\007Wait" +
      "ers\022D\n\007account\030\001 \003(\01323.com.fuchuan.custo" +
      "merservice.common.AccountBaseInfo\"\014\n\nWai" +
        "tersReq*\360\006\n\007Command\022\022\n\016COMMAND_UNKNOW\020\000\022" +
      "\031\n\025COMMAND_HANDSHAKE_REQ\020\001\022\032\n\026COMMAND_HA" +
      "NDSHAKE_RESP\020\002\022\024\n\020COMMAND_AUTH_REQ\020\003\022\025\n\021" +
      "COMMAND_AUTH_RESP\020\004\022\032\n\026COMMAND_JOIN_GROU" +
      "P_REQ\020\005\022\033\n\027COMMAND_JOIN_GROUP_RESP\020\006\022\"\n\036" +
      "COMMAND_JOIN_GROUP_NOTIFY_RESP\020\007\022\"\n\036COMM" +
      "AND_EXIT_GROUP_NOTIFY_RESP\020\010\022\024\n\020COMMAND_" +
      "CHAT_REQ\020\t\022\025\n\021COMMAND_CHAT_RESP\020\n\022\032\n\026COM" +
      "MAND_START_SHOW_REQ\020\013\022\033\n\027COMMAND_START_S" +
      "HOW_RESP\020\014\022\030\n\024COMMAND_END_SHOW_REQ\020\r\022 \n\034" +
      "COMMAND_END_SHOW_NOTIFY_RESP\020\016\022\031\n\025COMMAN" +
      "D_HEARTBEAT_REQ\020\017\022\032\n\026COMMAND_HEARTBEAT_R" +
      "ESP\020\020\022\025\n\021COMMAND_CLOSE_REQ\020\021\022\033\n\027COMMAND_" +
      "CLIENT_PAGE_REQ\020\022\022\034\n\030COMMAND_CLIENT_PAGE" +
      "_RESP\020\023\022\025\n\021COMMAND_LOGIN_REQ\020\024\022\026\n\022COMMAN" +
      "D_LOGIN_RESP\020\025\022\032\n\026COMMAND_CANCEL_MSG_REQ" +
      "\020\026\022\033\n\027COMMAND_CANCEL_MSG_RESP\020\027\022\024\n\020COMMA" +
      "ND_CALL_REQ\020\030\022\025\n\021COMMAND_CALL_RESP\020\031\022\027\n\023" +
      "COMMAND_REMIND_PUSH\020\032\022\027\n\023COMMAND_ONLINE_" +
      "PUSH\020\034\022\030\n\024COMMAND_OFFLINE_PUSH\020\035\022\034\n\030COMM" +
      "AND_CLEAR_REMIND_REQ\020\033\022\'\n#COMMAND_ONLINE" +
        "_NOTIFY_SUBSCRIBE_REQ\020\036\022\031\n\025COMMAND_TEST_" +
        "FILE_REQ\020\037*!\n\004Code\022\006\n\002OK\020\000\022\021\n\004FAIL\020\377\377\377\377\377" +
        "\377\377\377\377\001* \n\004Role\022\014\n\010CUSTOMER\020\000\022\n\n\006WAITER\020\0012" +
        "\242\003\n\016AccountService\022\201\001\n\rFetchBaseInfo\0226.c" +
        "om.fuchuan.customerservice.common.Accoun" +
        "tBaseInfoReq\0328.com.fuchuan.customerservi" +
        "ce.common.AccountBaseInfoReply\022\236\001\n\030Fetch" +
        "AccountListBaseInfo\022?.com.fuchuan.custom" +
        "erservice.common.FetchAccountListBaseInf" +
        "oReq\032A.com.fuchuan.customerservice.commo" +
        "n.FetchAccountListBaseInfoReply\022k\n\014Fetch" +
        "Waiters\022..com.fuchuan.customerservice.co" +
        "mmon.WaitersReq\032+.com.fuchuan.customerse" +
        "rvice.common.WaitersB@\n\"com.fuchuan.cust" +
        "omerservice.commonB\023CustomerServiceGrpcP" +
        "\001\242\002\002CSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_fuchuan_customerservice_common_AccountBaseInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_fuchuan_customerservice_common_AccountBaseInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fuchuan_customerservice_common_AccountBaseInfo_descriptor,
        new java.lang.String[] { "Id", "NickName", "Avatar", });
    internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReq_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReply_descriptor,
        new java.lang.String[] { "Code", "Account", "Role", });
    internal_static_com_fuchuan_customerservice_common_FetchAccountListBaseInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_fuchuan_customerservice_common_FetchAccountListBaseInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fuchuan_customerservice_common_FetchAccountListBaseInfoReq_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_fuchuan_customerservice_common_FetchAccountListBaseInfoReply_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_fuchuan_customerservice_common_FetchAccountListBaseInfoReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fuchuan_customerservice_common_FetchAccountListBaseInfoReply_descriptor,
        new java.lang.String[] { "Account", });
    internal_static_com_fuchuan_customerservice_common_Waiters_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_fuchuan_customerservice_common_Waiters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fuchuan_customerservice_common_Waiters_descriptor,
        new java.lang.String[] { "Account", });
    internal_static_com_fuchuan_customerservice_common_WaitersReq_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_fuchuan_customerservice_common_WaitersReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fuchuan_customerservice_common_WaitersReq_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
