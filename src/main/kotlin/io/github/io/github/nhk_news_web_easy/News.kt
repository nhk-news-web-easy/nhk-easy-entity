package io.github.io.github.nhk_news_web_easy

import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Transient

@Entity
class News : BaseEntity() {
    @Column(length = 50)
    var newsId = ""

    @Column(length = 50)
    var title = ""

    @Column(length = 500)
    var titleWithRuby = ""

    @Column(length = 1000)
    var outline = ""

    @Column(columnDefinition = "text")
    var outlineWithRuby = ""

    @Column(columnDefinition = "text")
    var body = ""

    @Column(columnDefinition = "text")
    var bodyWithoutHtml = ""

    @Column(length = 200)
    var url = ""

    @Column(length = 200)
    var m3u8Url = ""

    @Column(length = 200)
    var imageUrl = ""

    @Column
    var publishedAtUtc = Instant.now()

    @Transient
    var words = mutableSetOf<Word>()
}
