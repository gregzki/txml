package com.github.gregzki.txml.services

import com.intellij.openapi.project.Project
import com.github.gregzki.txml.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
