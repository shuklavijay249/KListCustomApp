# 📱 KList DSL – Jetpack Compose Custom List Builder

A declarative, reusable, and chainable Kotlin DSL built with Jetpack Compose for rendering composable lists. This project was developed as part of an assignment to showcase advanced Compose UI patterns inspired by the `Modifier` chaining approach.

---

## 🚀 Features

- ✅ **Fluent DSL** similar to Jetpack Compose `Modifier`
- ✅ **Composable List Rendering** using `LazyColumn`
- ✅ **Chainable Modifiers**: `.padding()`, `.header()`, `.items()`, `.withDivider()`
- ✅ **Multiple Sections Support**
- ✅ **Click Handling** on items (shows Toast)
- ✅ **Smooth Item Change Animation**
- ✅ **Divider Between Items**
- ✅ **Builder Pattern API**

---

## 🧱 DSL Usage Example

```kotlin
KList.builder<Coin>()
    .padding(16.dp)
    .section(header = "Top Gainers", list = topCoins) {
        KListItem(it) {
            Toast.makeText(context, "Clicked on ${it.name}", Toast.LENGTH_SHORT).show()
        }
    }
    .section(header = "Trending Coins", list = trendingCoins) {
        KListItem(it) {
            Toast.makeText(context, "Clicked on ${it.name}", Toast.LENGTH_SHORT).show()
        }
    }
    .withDivider()
    .render()

## 📸 Screenshot

![KList DSL Demo](https://raw.githubusercontent.com/shuklavijay249/KListCustomApp/main/assets/Screenshot.png)
