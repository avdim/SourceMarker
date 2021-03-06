package com.sourceplusplus.sourcemarker.actions

import com.intellij.openapi.editor.Editor
import com.sourceplusplus.marker.source.mark.SourceMarkPopupAction
import com.sourceplusplus.marker.source.mark.api.SourceMark
import com.sourceplusplus.protocol.ProtocolAddress.Global.OpenPortal
import com.sourceplusplus.sourcemarker.SourceMarkKeys.SOURCE_PORTAL
import com.sourceplusplus.sourcemarker.SourceMarkerPlugin

/**
 * todo: description.
 *
 * @since 0.1.0
 * @author [Brandon Fergerson](mailto:bfergerson@apache.org)
 */
class PluginSourceMarkPopupAction : SourceMarkPopupAction() {

    override fun performPopupAction(sourceMark: SourceMark, editor: Editor) {
        SourceMarkerPlugin.vertx.eventBus().send(OpenPortal, sourceMark.getUserData(SOURCE_PORTAL)!!)
        super.performPopupAction(sourceMark, editor)
    }
}
