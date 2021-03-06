// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AxOptions.proto

package org.okraAx.v3;

public final class AxOptions {
  private AxOptions() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(org.okraAx.v3.AxOptions.methodId);
    registry.add(org.okraAx.v3.AxOptions.serviceId);
    registry.add(org.okraAx.v3.AxOptions.isPublic);
    registry.add(org.okraAx.v3.AxOptions.serviceRef);
    registry.add(org.okraAx.v3.AxOptions.messageId);
    registry.add(org.okraAx.v3.AxOptions.messageRef);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int METHODID_FIELD_NUMBER = 1000;
  /**
   * <pre>
   *  Method's ID.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      java.lang.Integer> methodId = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Integer.class,
        null);
  public static final int SERVICEID_FIELD_NUMBER = 1000;
  /**
   * <pre>
   *  Service's ID.
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.lang.Integer> serviceId = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Integer.class,
        null);
  public static final int ISPUBLIC_FIELD_NUMBER = 1001;
  /**
   * <pre>
   *  Is service public.
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.lang.Boolean> isPublic = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int SERVICEREF_FIELD_NUMBER = 1002;
  /**
   * <pre>
   *  Java service reference.
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.lang.String> serviceRef = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int MESSAGEID_FIELD_NUMBER = 1000;
  /**
   * <pre>
   *  Message's ID.
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.Integer> messageId = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Integer.class,
        null);
  public static final int MESSAGEREF_FIELD_NUMBER = 1001;
  /**
   * <pre>
   *  Java Bean Class
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.String> messageRef = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017AxOptions.proto\022\rorg.okraAx.v3\032/protoc" +
      "/include/google/protobuf/descriptor.prot" +
      "o:1\n\010methodId\022\036.google.protobuf.MethodOp" +
      "tions\030\350\007 \001(\005:3\n\tserviceId\022\037.google.proto" +
      "buf.ServiceOptions\030\350\007 \001(\005:2\n\010isPublic\022\037." +
      "google.protobuf.ServiceOptions\030\351\007 \001(\010:4\n" +
      "\nserviceRef\022\037.google.protobuf.ServiceOpt" +
      "ions\030\352\007 \001(\t:3\n\tmessageId\022\037.google.protob" +
      "uf.MessageOptions\030\350\007 \001(\005:4\n\nmessageRef\022\037" +
      ".google.protobuf.MessageOptions\030\351\007 \001(\tB\034",
      "\n\rorg.okraAx.v3B\tAxOptionsH\001b\006proto3"
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
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
    methodId.internalInit(descriptor.getExtensions().get(0));
    serviceId.internalInit(descriptor.getExtensions().get(1));
    isPublic.internalInit(descriptor.getExtensions().get(2));
    serviceRef.internalInit(descriptor.getExtensions().get(3));
    messageId.internalInit(descriptor.getExtensions().get(4));
    messageRef.internalInit(descriptor.getExtensions().get(5));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
