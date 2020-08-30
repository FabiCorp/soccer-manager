import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Drawer from '@material-ui/core/Drawer';
import CssBaseline from '@material-ui/core/CssBaseline';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import List from '@material-ui/core/List';
import Typography from '@material-ui/core/Typography';
import Divider from '@material-ui/core/Divider';
import ListItem from '@material-ui/core/ListItem';
import ListItemIcon from '@material-ui/core/ListItemIcon';
import ListItemText from '@material-ui/core/ListItemText';
import ListDataTuple from './ListDataTuple';
import {
    BrowserRouter as Router,
    Switch,
    Route
  } from "react-router-dom";
import Transfer from '../transfer/Transfer';

const drawerWidth = 240;

const useStyles = makeStyles((theme) => ({
  root: {
    display: 'flex',
    height: '100%'
  },
  appBar: {
    width: `calc(100% - ${drawerWidth}px)`,
    marginLeft: drawerWidth,
  },
  drawer: {
    width: drawerWidth,
    flexShrink: 0,
  },
  drawerPaper: {
    width: drawerWidth,
  },
  // necessary for content to be below app bar
  toolbar: theme.mixins.toolbar,
  content: {
    flexGrow: 1,
    backgroundColor: theme.palette.background.default,
    padding: theme.spacing(3),
    height: '100%'
  },
  mainContent: {
    display: 'grid',
    height: '90%',
    gridTemplateColumns: 'repeat(12, 1fr)',
    gridTemplateRows: 'repeat(12, 1fr)'
  }
}));

const onListElementClick = path => window.location.pathname = path;

export default function PermanentDrawerLeft() {
  const classes = useStyles();

  return (
    <div className={classes.root}>
      <CssBaseline />
      <AppBar position="fixed" className={classes.appBar}>
        <Toolbar>
          <Typography variant="h6" noWrap>
            Soccer Manager 2020 (by Fabi and Fabi)
          </Typography>
        </Toolbar>
      </AppBar>
      <Drawer
        className={classes.drawer}
        variant="permanent"
        classes={{
          paper: classes.drawerPaper,
        }}
        anchor="left"
      >
        <div className={classes.toolbar} />
        <Divider />
        <List>
          {ListDataTuple.map(dataElement => (
            <ListItem button key={dataElement.name} onClick={ _ => onListElementClick(dataElement.path)}>
                <ListItemIcon>{dataElement.icon}</ListItemIcon>
                <ListItemText primary={dataElement.name} />
            </ListItem>
          ))}
        </List>
      </Drawer>
      <main className={classes.content}>
        <div className={classes.toolbar} />
        <div className={classes.mainContent}>
          <Router>
              <Switch>
                  <Route exact path="/">
                      test
                  </Route>
                  <Route path="/transfer">
                        <Transfer/>
                  </Route>
              </Switch>
          </Router>
        </div>
      </main>
    </div>
  );
}
