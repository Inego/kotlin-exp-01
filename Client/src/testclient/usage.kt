package testclient

import testlib.SeverelyExperimentalClass
import testlib.SlightlyExperimentalClass

fun main() {
    createSlight()
    createSevere()
}

private fun createSevere() {
    val severe = SeverelyExperimentalClass()
}

private fun createSlight() {
    val slight = SlightlyExperimentalClass()
}
