package com.sourceplusplus.protocol

/**
 * todo: description.
 *
 * @since 0.1.0
 * @author [Brandon Fergerson](mailto:bfergerson@apache.org)
 */
object ProtocolAddress {
    object Global { //todo: could probably rename to Plugin to indicate it's the module consuming message
        //Portal
        const val FindAndOpenPortal = "FindAndOpenPortal"
        const val OpenPortal = "OpenPortal"
        const val ClosePortal = "ClosePortal"
        const val ClickedViewAsExternalPortal = "ClickedViewAsExternalPortal"
        const val KeepAlivePortal = "KeepAlivePortal" //todo: remove
        const val UpdatePortalArtifact = "UpdatePortalArtifact"
        const val GetPortalConfiguration = "GetPortalConfiguration"
        const val CanOpenPortal = "CanOpenPortal"
        //const val OpenedPortal = "OpenedPortal"
        //const val ClosedPortal = "ClosedPortal"
        const val ChangedPortalArtifact = "ChangedPortalArtifact"
        const val NavigateToArtifact = "NavigateToArtifact"

        //Portal - Overview
        const val OverviewTabOpened = "OverviewTabOpened"
        const val RefreshOverview = "RefreshOverview"
        const val SetOverviewTimeFrame = "SetOverviewTimeFrame"
        const val ClickedEndpointArtifact = "ClickedEndpointArtifact"

        //Portal - Activity
        const val ActivityTabOpened = "ActivityTabOpened"
        const val SetMetricTimeFrame = "SetMetricTimeFrame"
        const val SetActiveChartMetric = "SetActiveChartMetric"
        const val RefreshActivity = "RefreshActivity"
        const val ArtifactMetricUpdated = "ArtifactMetricUpdated"

        //Portal - Traces
        const val TracesTabOpened = "TracesTabOpened"
        const val ClickedDisplayTraces = "ClickedDisplayTraces"
        const val ClickedDisplayTraceStack = "ClickedDisplayTraceStack"
        const val ClickedDisplaySpanInfo = "ClickedDisplaySpanInfo"
        const val GetTraceStack = "GetTraceStack"
        const val RefreshTraces = "RefreshTraces"
        const val ArtifactTraceUpdated = "ArtifactTraceUpdated"
        const val QueryTraceStack = "QueryTraceStack"
        const val ClickedStackTraceElement = "ClickedStackTraceElement"

        //Portal - Configuration
        const val ConfigurationTabOpened = "ConfigurationTabOpened"
        const val DisplayArtifactConfiguration = "DisplayArtifactConfiguration"
        const val UpdateArtifactEntryMethod = "UpdateArtifactEntryMethod"
        const val UpdateArtifactAutoSubscribe = "UpdateArtifactAutoSubscribe"
    }

    @Suppress("FunctionName")
    object Portal {
        fun UpdateEndpoints(portalUuid: String): String {
            return "$portalUuid-UpdateEndpoints"
        }

        fun ClearActivity(portalUuid: String): String {
            return "$portalUuid-ClearActivity"
        }

        fun UpdateChart(portalUuid: String): String {
            return "$portalUuid-UpdateChart"
        }

        fun DisplayCard(portalUuid: String): String {
            return "$portalUuid-DisplayCard"
        }

        fun DisplayTraces(portalUuid: String): String {
            return "$portalUuid-DisplayTraces"
        }

        fun DisplayTraceStack(portalUuid: String): String {
            return "$portalUuid-DisplayTraceStack"
        }

        fun DisplayInnerTraceStack(portalUuid: String): String {
            return "$portalUuid-DisplayInnerTraceStack"
        }

        fun DisplaySpanInfo(portalUuid: String): String {
            return "$portalUuid-DisplaySpanInfo"
        }

        fun DisplayArtifactConfiguration(portalUuid: String): String {
            return "$portalUuid-DisplayArtifactConfiguration"
        }
    }
}
