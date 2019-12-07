package example.myapp

//abstract class AquariumFish {
//    abstract val color: String
//}

class Shark : FishColor, FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}