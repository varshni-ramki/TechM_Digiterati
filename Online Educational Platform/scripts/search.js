document.getElementById("searchBar").addEventListener("keyup", function () {
    let query = this.value.toLowerCase();
    let courses = document.querySelectorAll(".course-card");

    courses.forEach(course => {
        let title = course.querySelector("h3").innerText.toLowerCase();
        course.style.display = title.includes(query) ? "block" : "none";
    });
});
