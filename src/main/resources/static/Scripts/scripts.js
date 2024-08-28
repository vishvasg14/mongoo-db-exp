document.addEventListener("DOMContentLoaded", function() {
	console.log("running");
	fetch('/home/get')
		.then(response => response.json())
		.then(data => {
			const container = document.getElementById('student-container');
			data.forEach(student => {
				const card = document.createElement('div');
				card.className = 'col-md-4 mb-4';
				card.innerHTML = `
              <div class="card">
                    <div class="card-header text-center bg-primary text-white">
                        <h2>Student Information</h2>
                    </div>
                    <div class="card-body">
                        <h4 class="card-title">Name: ${student.name}</h4>
                        <p class="card-text"><strong>Age:</strong> ${student.age}</p>
                        <p class="card-text"><strong>Course:</strong> ${student.course}</p>
                        <p class="card-text"><strong>University:</strong> ${student.university}</p>
                        <p class="card-text"><strong>Description:</strong> ${student.description}</p>
                    </div>
                    <div class="card-footer text-center">
                        <button class="btn btn-primary">View More</button>
                    </div>
                </div>
             `;
             container.appendChild(card);
			})
		})
		.catch(error => {
			console.error('Error fetching student data:', error);
			document.getElementById('student-card').innerHTML = '<p class="text-danger text-center">Failed to load student information.</p>';
		});
});
