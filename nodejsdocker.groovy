    job('NodeJS example) {
      scm {
        git('https://github.com/Eri4/jenkinsDSL.git') { node ->
          node / gitConfigName('DSL User')
          node / gitConfigEmail('ermirjace0@gmail.com')
        }
      }
      triggers {
        scm('h/5 * * * *')
        
      }
      warppers {
        nodejs('nodejs')
        
      }
      step {
        dockerBuildAndPush {
          repositoryName('patatjaeri/nodejs_test_app')
          tag('${GIT_REVISION,length=9}')
          registryCredentials('dockerhub')
          forcePull(false)
          forceTag(false)
          createFingerprints(false)
          skipDecorate()
        }
      }
      
  }
