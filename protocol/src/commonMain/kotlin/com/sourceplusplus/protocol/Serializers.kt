package com.sourceplusplus.protocol

import com.sourceplusplus.protocol.artifact.ArtifactType
import kotlinx.datetime.Instant
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * todo: description.
 *
 * @since 0.1.0
 * @author [Brandon Fergerson](mailto:bfergerson@apache.org)
 */
class Serializers {

    class InstantKSerializer : KSerializer<Instant> {

        override val descriptor = PrimitiveSerialDescriptor(
            "com.sourceplusplus.protocol.InstantKSerializer",
            PrimitiveKind.LONG
        )

        override fun deserialize(decoder: Decoder) = Instant.fromEpochMilliseconds(decoder.decodeLong())
        override fun serialize(encoder: Encoder, value: Instant) = encoder.encodeLong(value.toEpochMilliseconds())
    }

    class ArtifactTypeSerializer : KSerializer<ArtifactType> {

        override val descriptor = PrimitiveSerialDescriptor(
            "com.sourceplusplus.protocol.ArtifactTypeSerializer",
            PrimitiveKind.STRING
        )

        override fun deserialize(decoder: Decoder) = ArtifactType.valueOf(decoder.decodeString())
        override fun serialize(encoder: Encoder, value: ArtifactType) = encoder.encodeString(value.name)
    }
}