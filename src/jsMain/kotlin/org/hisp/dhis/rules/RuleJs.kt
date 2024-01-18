package org.hisp.dhis.rules

@JsExport
@OptIn(ExperimentalJsExport::class)
data class RuleJs(
    val condition: String,
    val actions: Array<RuleActionJs>,
    val uid: String = "",
    val name: String? = null,
    val programStage: String? = null,
    val priority: Int? = 0
)
