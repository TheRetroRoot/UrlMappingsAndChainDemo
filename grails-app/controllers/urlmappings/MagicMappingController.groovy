package urlmappings

class MagicMappingController {

    def index() {
        render text: params
    }

    def chain1(){
        chain(action:'chain2', model:['from': 'chain1'])
    }

    def chain2(){
        render text:chainModel
    }
}
