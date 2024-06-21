// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ca.proto

package com.alibaba.csp.sentinel.datasource.xds.client.grpc;

public interface IstioCertificateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.v1.auth.IstioCertificateRequest)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * PEM-encoded certificate request.
     * The public key in the CSR is used to generate the certificate,
     * and other fields in the generated certificate may be overwritten by the CA.
     * </pre>
     *
     * <code>string csr = 1;</code>
     *
     * @return The csr.
     */
    String getCsr();

    /**
     * <pre>
     * PEM-encoded certificate request.
     * The public key in the CSR is used to generate the certificate,
     * and other fields in the generated certificate may be overwritten by the CA.
     * </pre>
     *
     * <code>string csr = 1;</code>
     *
     * @return The bytes for csr.
     */
    com.google.protobuf.ByteString getCsrBytes();

    /**
     * <pre>
     * Optional: requested certificate validity period, in seconds.
     * </pre>
     *
     * <code>int64 validity_duration = 3;</code>
     *
     * @return The validityDuration.
     */
    long getValidityDuration();

    /**
     * <pre>
     * $hide_from_docs
     * Optional: Opaque metadata provided by the XDS node to Istio.
     * Supported metadata: WorkloadName, WorkloadIP, ClusterID
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 4;</code>
     *
     * @return Whether the metadata field is set.
     */
    boolean hasMetadata();

    /**
     * <pre>
     * $hide_from_docs
     * Optional: Opaque metadata provided by the XDS node to Istio.
     * Supported metadata: WorkloadName, WorkloadIP, ClusterID
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 4;</code>
     *
     * @return The metadata.
     */
    com.google.protobuf.Struct getMetadata();

    /**
     * <pre>
     * $hide_from_docs
     * Optional: Opaque metadata provided by the XDS node to Istio.
     * Supported metadata: WorkloadName, WorkloadIP, ClusterID
     * </pre>
     *
     * <code>.google.protobuf.Struct metadata = 4;</code>
     */
    com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

}
