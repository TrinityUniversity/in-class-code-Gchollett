/**
 * 
 */

window.onload() = (() => {
    console.log("Hello")
    $("countButton").click(function () {
        $("count").text = fetch("/increment")
    })
})
