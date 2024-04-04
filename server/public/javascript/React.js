class Count extends React.Component {
    constructor(props){
        super(props),
        this.state = {counter: 0}
    }
    render(){
        return React.createElement('div',null,
            React.createElement('img',
            {src: "https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Cookie.png/903px-Cookie.png",
                onclick: () => {
                    this.setState({counter: this.state.counter+1})
                }
            }
            ),
            React.createElement('p',null,this.state.counter)
        )
    }
}

const root = ReactDOM.render(
    React.createElement(Count),
    document.getElementById('react-root')
)
