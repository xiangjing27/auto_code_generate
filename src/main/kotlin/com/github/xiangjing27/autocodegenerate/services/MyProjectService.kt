package com.github.xiangjing27.autocodegenerate.services

import com.github.xiangjing27.autocodegenerate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
