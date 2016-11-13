package com.slack.geekbrainswork.crawler.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Nikolay on 09.11.2016.
 */

public class ParserPage {

    /**
     * метод получает текст страницы c адресом url и сохранеят в перемнную text объекта класса ParserPage
     * @param url адрес страницы
     * @return текст на странице
     * @throws IOException
     */
    public static String getTextFromPage (String url) throws IOException {

        Document doc;
        // получаем содержиое страницы с адресом url и передаем переменной doc
        doc = Jsoup.connect(url).userAgent("Mozilla").get();
        // из переменной doc из влекаем текст и возвращаем его как результат
        return doc.text().toString();

        }
}