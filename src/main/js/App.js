import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

class App extends React.Component {
    render() {
        return (
            <div>
                <h1>hello worldaaaaaaaaa</h1>
            </div>
        )
    }
}


{/*<Router>*/}
{/*    <Switch>*/}
{/*        <Route path='/' exact={true} component={Home}/>*/}
{/*    </Switch>*/}
{/*</Router>*/}

ReactDOM.render(
    <App />,
    document.getElementById('react')
);
