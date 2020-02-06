    job('NodeJS example') {
      scm {
        git('https://github.com/Eri4/node.js-Project.git') { node ->
          node / gitConfigName('DSL User')
          node / gitConfigEmail('ermirjace0@gmail.com')
        }
      }
      triggers {
        scm('h/5 * * * *')
        
      }
      wrappers {
        nodejs('nodejs')
        
      }
      steps {
        shell('npm install')
      }
  }
