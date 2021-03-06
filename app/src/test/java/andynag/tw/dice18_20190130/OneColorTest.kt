package andynag.tw.dice18_20190130

import org.junit.Assert
import org.junit.Test

class OneColorTest {

    @Test
    fun test_dice_is_all_same() {
        val inputDiceAllOne = "[1,1,1,1]"
        val expectIntArrayAllOne = listOf(
            Dice(1), Dice(1), Dice(1), Dice(1))
//        val dices:List<Dice> = listOf()
        val actualList:List<Dice> = Bowl(inputDiceAllOne).getDices()

        Assert.assertEquals(expectIntArrayAllOne,actualList)
    }

    @Test
    fun test_dice_is_Sepatla() {

        val inputDiceAllOne = "[1,1,6,6]"
        val bowl = Bowl(inputDiceAllOne)

        val actual = bowl.isSepatla()
        val expected = true

        Assert.assertEquals(expected, actual)
    }


    @Test
    fun test_dice_no_point_three_same() {

        val inputDiceAllOne = "[1,1,1,6]"
        val bowl = Bowl(inputDiceAllOne)
        val actual = bowl.isNoPoint()
        val expected = true

        Assert.assertEquals(expected, actual)

    }

    @Test
    fun test_dice_no_point_diff() {

        val inputDiceAllOne = "[1,2,3,6]"
        val bowl = Bowl(inputDiceAllOne)
        val actual = bowl.isNoPoint()
        val expected = true

        Assert.assertEquals(expected, actual)

    }
}