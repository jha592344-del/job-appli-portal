// Very basic JavaScript: only search and apply.

var cards = document.getElementsByClassName("job-card");

// ----- SEARCH -----
function searchJobs() {
  var text = document.getElementById("searchInput").value.toLowerCase();
  var found = 0;

  for (var i = 0; i < cards.length; i++) {
    var title = cards[i].getElementsByTagName("h3")[0].innerText.toLowerCase();

    if (title.includes(text)) {
      cards[i].classList.remove("hidden");
      found++;
    } else {
      cards[i].classList.add("hidden");
    }
  }

  // Show a message when nothing matches
  if (found == 0) {
    document.getElementById("noResult").classList.remove("hidden");
  } else {
    document.getElementById("noResult").classList.add("hidden");
  }
}

document.getElementById("searchBtn").onclick = searchJobs;

// ----- APPLY -----
function applyJob(card, button) {
  var title = card.getElementsByTagName("h3")[0].innerText;
  var company = card.getElementsByClassName("company")[0].innerText;

  // Add the job to the Applied Jobs list
  var item = document.createElement("li");
  item.innerText = title + " - " + company;
  document.getElementById("appliedList").appendChild(item);
  document.getElementById("noApplied").classList.add("hidden");

  // Stop the user from applying twice
  button.innerText = "Applied";
  button.disabled = true;
}

var buttons = document.getElementsByClassName("apply-btn");

for (var i = 0; i < buttons.length; i++) {
  buttons[i].onclick = function () {
    applyJob(this.parentElement, this);
  };
}
