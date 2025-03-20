package org.mliboot.libxp.lint

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.Issue

class MIssueRegistry : IssueRegistry() {
    override val issues: List<Issue>
        get() = emptyList()
}
