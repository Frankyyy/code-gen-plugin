package com.github.frankyyy.codegenplugin.services

import com.intellij.openapi.project.Project
import com.github.frankyyy.codegenplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
