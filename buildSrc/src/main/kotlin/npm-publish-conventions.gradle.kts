import dev.petuska.npm.publish.extension.domain.NpmAccess

plugins {
    id("dev.petuska.npm.publish")
}

project.afterEvaluate {
    npmPublish {
        access.set(NpmAccess.PUBLIC)
        packages {
            named("js") {
                scope.set("vgarciabnz")
                packageName.set("rule-engine")
                readme.set(File("./README.md"))
                packageJson {
                    "contributors" by Props.DEVELOPERS.map { developer ->
                        "${developer.name} <${developer.email}>"
                    }
                    "description" by Props.DESCRIPTION
                    "license" by Props.LICENSE_NAME
                    "repository" by {
                        "type" by Props.REPOSITORY_TYPE
                        "url" by Props.REPOSITORY_URL
                    }
                    "publishConfig" by {
                        "access" by "public"
                    }
                    "private" by false
                }
            }
        }
    }
}
