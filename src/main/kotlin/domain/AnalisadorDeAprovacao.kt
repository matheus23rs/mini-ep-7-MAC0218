package domain


import domain.criterios.Basico
import domain.criterios.CriterioDeAprovacao
import domain.criterios.Intermediario
import domain.criterios.Rigoroso

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------
    var criterio:CriterioDeAprovacao = CriterioDeAprovacao()
    var boletimFechado:BoletimFechado = BoletimFechado()

    fun defineCriterio(crit: CriterioDeAprovacao) {
        criterio = crit
        println("Criterio definido")
    }

    fun fechaBoletim(bol: Boletim) {
        boletimFechado = bol
        boletimFechado.foiAprovado = criterio.estaAprovado(boletim)
        boletimFechado.mediaFinal = criterio.mediaFinal(boletim)
        return boletimFechado
    }


}