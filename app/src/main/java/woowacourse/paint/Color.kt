package woowacourse.paint

data class Color(val name: String, val hex: String) {
    fun toColorInt(): Int {
        return android.graphics.Color.parseColor(hex)
    }
}
