import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {

	state = {}

	componentDidMount() {
		setInterval(this.hello, 1050);
		setInterval(this.median, 300);
	}

	hello = () => {
		fetch('/api/hello')
			.then(response => response.text())
			.then(message => {
				this.setState({ message: message });
			});
	};
	
	median = () => {
		var integer = 4;
		fetch('/api/median/5', {
			 headers: {
		      'Accept': 'application/json',
		      'Content-Type': 'application/json'
		    },
		    method: 'POST',
					
			body: "53"
			
		})
			.then(response => response.text())
			.then(message => {
				this.setState({ median_message: message });
			});
	};


	render() {
		return (
			<div className="App">
				<header className="App-header">
					<img src={logo} className="App-logo" alt="logo" />
					<p>
						{this.state.message}
					</p>
					<p>
						Value from median: {this.state.median_message}
					</p>
				</header>
			</div>
		);
	}
}

export default App;
