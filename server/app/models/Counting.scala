package models

import java.util.concurrent.atomic.AtomicInteger

object Counting {
    private var count = new AtomicInteger()
    def increment() = {print("wow"); count.incrementAndGet()}
    def getCount() = {count.get()}
}