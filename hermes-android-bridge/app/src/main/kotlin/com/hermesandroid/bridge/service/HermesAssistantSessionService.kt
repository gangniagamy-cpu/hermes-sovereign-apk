package com.hermesandroid.bridge.service

import android.os.Bundle
import android.service.voice.VoiceInteractionSession
import android.service.voice.VoiceInteractionSessionService

class HermesAssistantSessionService : VoiceInteractionSessionService() {
    override fun onNewSession(args: Bundle?): VoiceInteractionSession {
        return HermesAssistantSession(this)
    }
}

class HermesAssistantSession(context: android.content.Context) : VoiceInteractionSession(context) {
    override fun onHandleAssist(data: Bundle?, structure: android.app.assist.AssistStructure?, content: android.app.assist.AssistContent?) {
        super.onHandleAssist(data, structure, content)
        
        // Trigger the Sovereign AI Agent via WebSocket Event
        com.hermesandroid.bridge.client.RelayClient.sendEvent("assistant_trigger", mapOf(
            "timestamp" to System.currentTimeMillis(),
            "packageName" to (data?.getString("packageName") ?: "unknown")
        ))
        
        // Finish the session quickly to return to user
        finish()
    }
}
