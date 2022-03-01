val musicLover = false
val previousPurchaseAmount = 100000
val amount = 10
val discount5 = 0.05
val discount1 = 0.01
val discount100 = 100

fun main() {
    if (previousPurchaseAmount in 0..1000) {
        if (musicLover) {
            println("Итого к оплате " + (amount - amount * discount1) + " рублей")
        } else {
            println("Итого к оплате " + amount + " рублей")
        }
    }
    if (previousPurchaseAmount in 1001..10000) {
        if (musicLover) {
            if ( amount - discount100 - amount * discount1 <= 0 ) {
                println("Сумма к оплате 0 рублей")
            } else {
                println("Итого к оплате " + ((amount - discount100) - amount * discount1)  + " рублей")
            }
        } else {
            if (amount - discount100 <= 0) {
                println("Сумма к оплате 0 рублей")
            } else {
                println("Итого к оплате " + (amount - discount100) + " рублей")
            }
        }
    }
    if (previousPurchaseAmount > 10000) {
        if (musicLover) {
            println("Итого к оплате " + (amount - amount * discount5 - amount * discount1)  + " рублей")
        } else {
            println("Итого к оплате " + (amount - amount * discount5)  + " рублей")
        }
    }
}
