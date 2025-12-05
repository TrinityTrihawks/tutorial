package org.first.tutorial

import java.io.IOException
import java.nio.file.Path

class Exercise {

    @Throws(IOException::class)
    fun readLines(path: Path): List<String> {
        // TODO: read all lines from the file.
        return emptyList()
    }

    @Throws(IOException::class)
    fun writeLog(path: Path, lines: List<String>) {
        // TODO: overwrite the file with the provided lines.
    }

    @Throws(IOException::class)
    fun firstNonEmptyLine(path: Path): String {
        // TODO: return the first trimmed non-blank line or "NONE".
        return ""
    }
}
