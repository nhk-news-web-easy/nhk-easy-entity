package io.github.io.github.nhk_news_web_easy

import javax.persistence.Column
import javax.persistence.Entity

@Entity
class NewsWord : BaseEntity() {
    var newsId = 0

    var wordId = 0

    @Column(length = 10)
    var idInNews = ""
}
