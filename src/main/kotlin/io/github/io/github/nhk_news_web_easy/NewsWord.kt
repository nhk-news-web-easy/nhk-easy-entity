package io.github.io.github.nhk_news_web_easy

import javax.persistence.Column
import javax.persistence.Entity

@Entity
class NewsWord : BaseEntity() {
    @Column
    var newsId = 0

    @Column
    var wordId = 0

    @Column
    var idInNews = ""
}
