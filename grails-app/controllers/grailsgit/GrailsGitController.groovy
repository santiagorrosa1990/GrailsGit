package grailsgit

import java.util.stream.Collectors

class GrailsGitController {

    def static CategoryVisits(Long id){
        CategoryService categoryService
        Category category = categoryService.get(id)
        category.visits ++
        categoryService.save(category)
        return category
    }


    def list() {
        def lista = Site.getAll()
        //filtrada = lista.stream().filter{it -> it.getActive()}.collect(Collectors.toList())
        render(view: "list", model: [lista: lista])
    }

    def index() { }

}
