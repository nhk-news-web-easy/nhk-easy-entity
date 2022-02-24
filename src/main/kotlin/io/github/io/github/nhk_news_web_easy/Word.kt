package io.github.io.github.nhk_news_web_easy

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Transient

@Entity
class Word : BaseEntity() {
    @Column(length = 50)
    var name = ""

    @Transient
    var definitions = mutableListOf<WordDefinition>()

    @Transient
    var idInNews = ""
}
