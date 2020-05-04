import React from 'react';

const App = () => {
    return (
        <Router>
            <Switch>
                <Route path='/' exact={true} component={Home}/>
            </Switch>
        </Router>
    );
};

export default App;
