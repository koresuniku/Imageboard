package com.bitapps.imageboard

import com.bitapps.imageboard.model.Board

actual fun getBoards(): List<Board> {
    return arrayListOf(Board("dfd"), Board("dgfgfdg"), Board("gsfasdf"))
}
