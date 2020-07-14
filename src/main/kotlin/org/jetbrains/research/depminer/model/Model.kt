package org.jetbrains.research.depminer.model

enum class ConnectionType {
    USAGE // "from" is declared in "to"
}

enum class ElementType {
    FILE,
    CLASS,
    FUNCTION,
    LINE
}

data class Dependency(val type: ConnectionType, val from: CodeElement, val to: CodeElement)

data class FileLocation(val line: Int, val offset: Int)

data class FileRange(val start: FileLocation, val end: FileLocation)

data class LocationInfo(val path: String, val range: FileRange)

data class CodeElement(val physicalLocation: LocationInfo)
