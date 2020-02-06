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
      steps {
        shell('npm install')
      }
  }
